# Network Simulator Cheat Sheet

## Basic

### Variables

```tcl
set var value 
$var  # use variable with $ sign
```

### Loop

```tcl
for {set i 0} {$i < 5} {incr i} {
    # loops for 5 times
}
```

### Arrays

```tcl
set arr(0) value
set arr(1) value
set arr(2) value

puts $arr(0)
```

### Shapes

```
circle
square
box
hexagon
```

### Colors

```
black 
blue 
dodgerblue 
violet 
darkviolet 
red 
pink 
yellow 
orange 
green 
darkgreen 
magenta 
darkmagenta 
brown
```

### Directions

```
up
down
left
right
right-up
right-down
left-up
left-down
```

### For Advance TCL Scripting

* <https://www.tutorialspoint.com/tcl-tk/index.htm>

## Boilerplate code / Template

```tcl
set ns [new Simulator] 
set nf [open out.nam w]            # update filename
set tr [open out.tr w]             # update filename
$ns namtrace-all $nf                     
$ns trace-all $tr                 

proc finish {} { 
    global ns nf tr
    $ns flush-trace
    close $nf
    close $tr
    exec nam out.nam &             # update filename
    exit 0
}

# Your network Logic here!
# Your network simulation Timeline here!

$ns run                            # runs the simulator
```

## Nodes

Creating a node & assigning it to a variable `n1`

```tcl
set n1 [$ns node]
```

Change node Color

```tcl
$n1 color blue
```

Change the shape of a node `n1`

```tcl
$n1 shape circle
```

Add label to the node `n1`

```tcl
$n1 lable "label" 
```

Change label color

```tcl
$n1 label-color red
```

Change label position

```tcl
$n1 label-at up
```

## Links

Creating duplex link between `node1` & `node2`

```tcl
$ns duplex-link $node1 $node2 $bandwidth $delay $algorithm
```

i.e.

```tcl
# creates link bw n1 & n2 will bandwidth of 100Mbps and delay of 10ms
# using DropTail algorithm 
$ns duplex-link $n1 $n2 100Mb 10ms DropTail
```

Changing Position of Links bw `node1` & `node2`

```tcl
 $ns duplex-link-op $node1 $node2 orient $position
```

Adding Label to Link

```tcl
$ns duplex-link-op $node1 $node2 label $label
```

Changing color of Link's label

```tcl
$ns duplex-link-op $node1 $node2 color $labelColor
```

## Queue

Setting up Queue on link

```tcl
$ns queue-limit $node1 $node2 $size
```

Changing orientation of Queue
```tcl
# i.e. $orientation 0.5 will make it perpendicular to link
$ns duplex-link-op $node1 $node2 queuePos $orientation
```

## Connections & Application

Sample for Ftp over TCP from `node1` to `node2`

```tcp
set tcp [new Agent/TCP]
$ns attach-agent $node1 $tcp
set sink [new Agent/TCPSink]
$ns attach-agent $node2 $sink
$ns connect $tcp $sink

# Setup connection color
$ns color 1 red
$tcp set fid_ 1

# setup of FTP OVER TCP CONNECTION
set ftp [new Application/FTP]
$ftp attach-agent $tcp
$ftp set type_ FTP
```

Sample for CBR (Constant Bit Rate) over UDP from `node1` to `node2` with rate `4Mbps`

```tcp
set udp [new Agent/UDP] 
$ns attach-agent $node1 $udp 
set null [new Agent/Null] 
$ns attach-agent $node2 $null 
$ns connect $udp $null 

# Setup connection color
$ns color 2 blue
$tcp set fid_ 2

set cbr [new Application/Traffic/CBR] 
$cbr attach-agent $udp 
$cbr set type_ CBR 
$cbr set packet_size_ 1024
$cbr set rate_ 4mb
$cbr set random_ false 
```
### Routing Protocols

#### Distance vertor routing protocol

```tcl
$ns rtproto DV
```

#### Open Link State protocol

```tcl
$ns rtproto LS
```

Setting cost on link from `node1` to `node2`

```tcl
# $cost is a number
$ns cost $node1 $node2 $cost
```

# Changing Link state at time

Sample
```tcl
$ns rtmodel-at 2.0 down $n2 $n3
$ns rtmodel-at 2.7 up $n2 $n3
```

## Timeline

```tcl
$ns at $time "$command"
```

i.e.

```tcl
$ns at 1.5 "finish"
```

## XGraph

Sample

```tcl
for {set a 0} {$a < 2} {incr a} {
    set f$a [open out$a.tr w]
}
proc record {} {
    global sink null f0 f1
    set ns [Simulator instance]
    set time 0.5
    set now [$ns now]
    set bw0 [$sink set bytes_]
    set bw1 [$sink set bytes_]
    puts $f0 "$now [expr $bw0/$time*8/1000000]"
    puts $f1 "$now [expr $bw1/$time*8/1000000]"
    $sink set bytes_ 0
    $sink set bytes_ 0
    $ns at [expr $now+$time] "record"
}
# add to Timeline
$ns at 0.0 "record"
```
