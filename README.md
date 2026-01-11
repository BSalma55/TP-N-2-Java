Exercice 1 :


I. Collections & Streams

1. Lists
   
In this part, I created a simple application to manage a list of product-type objects. First, I defined a Product class with the attributes id (long), name (String), and price (double) to represent each product. Then, I developed a ProductManagementApp class containing the main method, where an ArrayList is used to store the products. The application allows performing several operations on the list: adding new products, deleting a product by its index, displaying all products, modifying a product at a specific index, and searching for a product by its name, as entered by the user.


Code :

<img width="647" height="683" alt="image" src="https://github.com/user-attachments/assets/d4e400fa-b639-473a-9a6b-8d5d5b5a0ff0" />
<img width="840" height="331" alt="image" src="https://github.com/user-attachments/assets/899d79e8-344f-45d1-a9a0-912bb590831e" />
<img width="833" height="773" alt="Capture d&#39;écran 2026-01-11 154557" src="https://github.com/user-attachments/assets/fd9efc40-dc5d-4e34-b2c3-8eeac1d234dd" />
<img width="852" height="493" alt="Capture d&#39;écran 2026-01-11 154652" src="https://github.com/user-attachments/assets/7a125873-ed13-4889-a8cc-bcb354ea721a" />


Exécution :


<img width="592" height="267" alt="image" src="https://github.com/user-attachments/assets/8da463d9-d2a8-4fd7-ad10-294090822cd7" />


2. Maps  :

   
In this part, I created a HashMap to store student grades, where the key is a String representing the student’s name and the value is a double representing the grade. The application allows performing several operations on this collection: inserting student grades, increasing a student’s grade, deleting a grade, displaying the size of the map, and calculating the average, maximum, and minimum grades. It also allows checking if a grade equal to 20 exists. After each operation, the list of students and their grades is displayed using a forEach loop with a lambda expression,


Code :


<img width="953" height="865" alt="image" src="https://github.com/user-attachments/assets/a671de67-4e03-497b-ada1-2c64f9552bcd" />
<img width="900" height="322" alt="image" src="https://github.com/user-attachments/assets/83423287-f043-4b18-8a52-530370903594" />

Exécution :

<img width="830" height="617" alt="image" src="https://github.com/user-attachments/assets/71a3fde8-c274-4cd9-841e-ed9087e850d5" />



3. Sets :

In this part, I created two HashSet collections named groupA and groupB, containing the names of students in groups A and B. The application allows performing several operations on these sets: adding student names to each HashSet, displaying the intersection of the two sets (students present in both groups), and displaying the union of the two sets (all students from both groups without duplicates).

Code :

<img width="1167" height="792" alt="image" src="https://github.com/user-attachments/assets/9f0744e2-5ff6-4eee-a953-cb744f56bd33" />


Exécution :

<img width="612" height="132" alt="image" src="https://github.com/user-attachments/assets/823da80b-710e-4111-9846-d9a3db260566" />


II. Generics

Part 1 :

I created a GenericStorage class capable of storing elements of any type (Integer, String, Double…) using an internal list to hold the data. This class provides several methods to efficiently manage the collection: addElement(T o) to add an element, removeElement(int index) to remove an element at a specific position, getElement(int index) to retrieve an element, and getSize() to get the number of elements currently stored. To test its functionality, I developed a test class that uses GenericStorage with different types of data and performs operations such as adding, removing, accessing, and checking the size of the list.

Code :


<img width="767" height="818" alt="image" src="https://github.com/user-attachments/assets/653b49d1-de16-4833-a749-5a536b88ed1a" />
<img width="733" height="178" alt="image" src="https://github.com/user-attachments/assets/eb21ee4b-2f34-4852-a2f5-434e3225c801" />

<img width="1237" height="701" alt="image" src="https://github.com/user-attachments/assets/c7fd0a1a-3da1-4ca3-ab9b-c8de80b99bdc" />


Exécution :


<img width="920" height="388" alt="image" src="https://github.com/user-attachments/assets/5774b901-640c-466e-b31e-cd55f127a9e5" />


Part 2 :

In this part, I used generics to manage a collection of Product objects. I created a Product class with the attributes id, name, brand, price, description, and stock, allowing each product to be represented with complete information, along with getters to access the data and a toString() method to easily display the details. Next, I defined a generic interface IMetier<T> that declares methods for managing the objects: adding an object (add), retrieving all objects (getAll), searching for a product by its ID (findById), and deleting a product (delete). The class MetierProduitImpl implements this interface and contains an internal list of products, providing concrete methods to manage the collection. Finally, an Application class provides an interactive menu in the main method, allowing the user to display all products, search for a product by ID, add a new product, delete a product, or exit the program.


Code :

<img width="1272" height="783" alt="image" src="https://github.com/user-attachments/assets/f9e8dff7-30d0-4966-8a2a-01c396209817" />
<img width="693" height="488" alt="image" src="https://github.com/user-attachments/assets/fe0d8792-5a0f-4af3-a2b4-fa6777da6d25" />
<img width="1028" height="791" alt="image" src="https://github.com/user-attachments/assets/c306a93a-69eb-477c-8f44-7189eb94edc4" />
<img width="742" height="257" alt="image" src="https://github.com/user-attachments/assets/16fe878b-f253-49a6-aa96-e98375d7cb2f" />
<img width="890" height="456" alt="image" src="https://github.com/user-attachments/assets/c95accda-0ce8-4503-b44c-440c5dfa7d44" />
<img width="882" height="493" alt="image" src="https://github.com/user-attachments/assets/6b6e7bcb-fb7f-4171-8bf4-95ae8125f72b" />
<img width="1277" height="463" alt="image" src="https://github.com/user-attachments/assets/f00ef8af-881e-4b90-ace1-7af387a6c6bf" />

Exécution :

<img width="765" height="621" alt="image" src="https://github.com/user-attachments/assets/e2644536-0348-4dc5-bcbc-2893569e0378" />





















