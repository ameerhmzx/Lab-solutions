# Packet Tracer Cheat Sheet

## Assign an IP address to any Interface

```
  enable
  configure terminal
  interface [interface_name]            // i.e. fastEternet0/1 or serial3/0
  ip address [ip_address] [subnet_mask] // [ip_address] i.e. 192.168.1.1 
                                        // [subnet_mask] i.e. 255.255.255.0
```

## Implement DHCP from Router

```
  enable
  configure terminal
  ip dhcp pool [pool_name]    // [pool_name] can be any unique name.
  network [networks_ip]       // [networks_ip] is the network you want to associate 
                              // this DHCP with i.e. 192.168.10.0.
  default-router [router_ip]  // [router_ip] shoud be the ip address of the router, 
                              // don't forget to assign ip to your router's port
                              // this will become the default gateway in DHCP.
```

## DNS provision from Router's DHCP

```
  enable
  configure terminal
  ip dhcp pool [pool_name]    // [pool_name] can be existing or new pool.
  dns-server [dns_server_ip]  // [dns_server_ip] should provide dns services.
```

## Implement Vlan on Switch for VOIP

```
  enable
  configure terminal
  interface range [starting_interface] - [ending_interface]  // interfaces on which IP phones are connected.
  switch-port mode access
  switch-port voice vlan [n]                                 // [n] should be a number. 
```

## Implement VOIP on Router

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