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

Creating a node & assigning it to a variable \`n1\`

```tcl
set n1 [$ns node]
```

Change node Color

```tcl
$n1 color blue
```

Change the shape of a node \`n1\`

```tcl
$n1 shape circle
```

Add label to the node \`n1\`

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

## Connections

> TODO

## Timeline

```tcl
$ns at $time "$command"
```

i.e.

```tcl
$ns at 1.5 "finish"
```

