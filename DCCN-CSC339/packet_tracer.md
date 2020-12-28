# Packet Tracer Cheat Sheet

### Assign an IP address to any Interface

```
  enable
  configure terminal
  interface [interface_name]            // i.e. fastEternet0/1 or serial3/0
  ip address [ip_address] [subnet_mask] // [ip_address] i.e. 192.168.1.1 
                                        // [subnet_mask] i.e. 255.255.255.0
```

## Dynamic Routing Protocols
> static routing can be setup from the GUI

### RIP

```
enable
configure terminal
router rip
network [network_address]  # i.e. 192.168.1.0
```

> Repeat the network command for every network directly attached to the Router (don't add networks attached to other routers in the network)

```
# to remove RIP
no router rip

# to remove network
no network [network_address] # i.e. 192.168.1.0
```

### EIGRP

```
enable
configure terminal
router eigrp [asn]         # here asn can be any number
network [network_address] [subnet_mask]  # i.e. 192.168.1.0 255.255.255.0
```

> note: Asn should be same for all the routers who needs to form a network 
>
> Repeat the network command for every network directly attached to the Router (don't add networks attached to other routers in the network)

```
# to remove EIGRP
no router eigrp [asn]

# to remove network
no network [network_address] [subnet_mask]  # i.e. 192.168.1.0 255.255.255.0
```

### OSPF

```
enable
configure terminal
router ospf [asn]         # here asn can be any number
network [network_address] [reverse_subnet]  # i.e. 192.168.1.0 0.0.0.255
```

> note: Asn should be same for all the routers who needs to form a network. Also OSPF uses reverse subnet mask. 
>
> Repeat the network command for every network directly attached to the Router (don't add networks attached to other routers in the network)
```
# to remove OSPF
router ospf [asn] 

# to remove network
no network [network_address] [reverse_subnet]  # i.e. 192.168.1.0 0.0.0.255
```

## DHCP & DNS

### Implement DHCP from Router

```
  enable
  configure terminal
  ip dhcp pool [pool_name]       // [pool_name] can be any unique name.
  network [networks_ip] [mask]   // [networks_ip] is the network you want to associate 
                                 // this DHCP with i.e. 192.168.10.0. [mask] i.e., 255.255.255.0
  default-router [router_ip]  // [router_ip] shoud be the ip address of the router, 
                              // don't forget to assign ip to your router's port
                              // this will become the default gateway in DHCP.
```

### Implement IP Helper on Router

> Required when DHCP server is outside the network
>
> Make sure to provide static IP to DHCP server before this step and also create dhcp pools on the server with Default Gateway as the IP address of the router, DNS server (optional) and starting IP.

```
enable
configure terminal
interface [interface_name]
ip address [ip_address] [subnet_mask]  // This ip will end up to be the 
                                       // default gateway in DHCP server
ip helper-address [dhcp_address]       // dhcp_address is the ip address of DHCP server
no shutdown
```

### DNS provision from Router's DHCP

```
  enable
  configure terminal
  ip dhcp pool [pool_name]    // [pool_name] can be existing or new pool.
  dns-server [dns_server_ip]  // [dns_server_ip] should provide dns services.
```

## VOIP

### Implement Vlan on Switch for VOIP

```
  enable
  configure terminal
  interface range [starting_interface] - [ending_interface]  // interfaces on which IP phones are connected.
  switchport mode access
  switchport voice vlan [n]                                 // [n] should be a number. 
```

### Implement VOIP on Router

> note: only use 2811 router 

```
  enable
  configure terminal
  ip dhcp pool [pool_name]   // usually "voice" is used as [pool_name]
  option 150 ip [ip_address] // [ip_address] should be the ip of router's port
                             // on which ip phone / switch for ip phones is going to connect
  exit
  telephony-service
  max-dn [n]                 // [n] is the number of max directory numbers >= phones you want to connect.
  max-ephones [n]            // [n] is the number of phones you want to connect.
  ip source-address [ip_address] port [port_n] // [port_n] can be any port number
  auto assign [n] to [m]     // [n] minimum, [m] maximum number of directory to assign
                             // usually [n] = 1 & [m] >= number of phones.
  exit
  ephone-dn [tag]            // [tag] is the dn number assigned to ip phone
  number [number_of_phone]   // [number_of_phone] is the phone number you want to assign
                             // to that directory / phone on that directory number.
  exit
  [
    repeat the step from `ephone-dn[tag]` 
    to assign pnone numbers to every ip 
    phone in the network
  ]
```

## VLAN

```
show vlan # to show vlan configuration
show run # show all configuratin
```

### Create VLAN on Switch

```
  enable
  configure terminal
  vlan [n]                        // n should be a number
  name [name]                     // name of vlan
  exit
```

### Bind VLAN with interface on Switch 

```
  enable
  configure terminal
  
  interface range [starting_interface] - [ending_interface]  // select interfaces you want to include in vlan
                                                             // you can also use `interface [interface]` to include only one interface
  switchport mode access                                    // mode can be [access, trunk] 
  switchport access vlan [n]                                       // [n] should be a number. 
```

### Trunk an Interface of Switch

```
  enable
  configure terminal
  interface [interface]                                      // or you can select range using 
                                                             // interface range [starting_interface] - [ending_interface]
  switchport mode trunk                                   
```

## VTP

### Implementing VTP Domain 

```
  enable
  configure terminal
  vtp domain [domain_name]                           // domain can be any unique name or address i.e. CS
  vtp mode [mode]                                    // mode can be [server, client, transparent]
```
> note: don't forget to trunk the interface to other vtp switches


## InterVLAN Routing

### Router on a Stick method

> node: make sure you have vlan setup and router's link to switch is in trunk mode

```
  enable
  configure terminal
  interface [interface].[n]                     // [interface] i.e. fastEthernet0/0
                                                // [n] should be a number
                                                // example: fa0/0.1
  encapsulation dot1Q [v]                       // [v] is the number of vlan 
                                                // which is going to hold this interface
  ip address [ip] [subnet_mask]                 // provide ip to the gateway of this sub-interface 
```
