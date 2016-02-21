For this project, you will extend Project #1 in two distinct ways. 

1) You need to enable your client and server to communicate using Remote Procedure Calls (RPC) instead of sockets.  If you’ve implemented Project #1 in Java, you may want to look into and leverage Java RMI for RPC communication.  However, there are multiple other RPC frameworks you can leverage (with their own IDLs) to provide the stubs/skeletons necessary across the network.  An additional example that enables the use of multiple languages is Apache Thrift (http://thrift.apache.org/ (Links to an external site.)
 (Links to an external site.) (Links to an external site.)). 

2) You need to make it possible that RPC functions can be called concurrently, consequently, you will need to handle mutual exclusion. 

As in project #1, you should use your client to pre-populate the Key-Value store with data and a set of keys.  The composition of the data is up to you in terms of what you want to store there.  Once the key-value store is populated, your client must do at least five of each operation: 5 PUTs, 5 GETs, 5 DELETEs. 
