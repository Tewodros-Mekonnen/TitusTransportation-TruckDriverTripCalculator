# TitusTransportation-TruckDriverTripCalculator
I created this app to calculate trip payment for truck drivers at Titus Transportation llc, https://titustrans.com/. 
Titus is a transportation company that transports groceries to Aldi grocery stores in different states.
This app is set to work for a warehouse located in Rosenberg, TX which serves Houston and surrounding cities.
The app works as follows.
Inside AldiStores.java, I created an array that contains round trip miles from warehouse to a specific grocery store number. Each index
value represents the round trip distance in miles. Soon, I will transfer this data to a mySql database.
In a specific trip, a driver may have full trailer load to a single store or he/she may perform multiple stops, usually up to 4 stops, 
in a single trip. Payment for a single trip depends on number of stops, mile pay and loading/unloading fee. 
E.x. If a specific trip has 3 stops, deliver 3 different stores at different locations, payment calculation is as follows:  
   1. we will compare total round trip distance for each store and pick the farthest one. Now this is the distance in miles that we will 
   use to calculate mile pay.
   2. since this trip has multiple stops, we will get payment for each additional stops. E.X.  A 3 stopper will recieve 
      2 extra stop payment, a 2 stopper will recieve 1 extra stop payment etc...
   3. loading/unloading fee
   
   therefore, total payment will be milePay + extraStopPayment + loading/unloading fee
   All of this variables are defined(naming is different inside the program) both inside AldiStores.java and DriverTrip.java
 


