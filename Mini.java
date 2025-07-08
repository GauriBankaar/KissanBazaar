import java.util.Scanner;

import java.util.ArrayList;

class User

{

String mail, pd, a;

int i, z;

ArrayList<String> user_id = new ArrayList<>();

User u[] = new User[100];

Scanner sc = new Scanner(System.in).useDelimiter("\n");

Scanner sca = new Scanner(System.in);

User() {
}

User(String mail, String pd)

{

this.mail = mail;

this.pd = pd;

}

void Login()

{

int w = 0;

System.out.print("\n");

System.out.print("Enter email id: ");

String id = sc.next();

for (i = 0; i < user_id.size(); i++)

{

if (u[i].mail.equals(id))

{

System.out.print("Enter password: ");

String password = sc.next();

if (u[i].pd.equals(password))

{

z = i;

System.out.print("\nYou have successfully logged in 👍");

} else {
System.out.print("\nWrong password!");
System.out.print("\nTry again");

Login();

}
}

else

{

w++;

}

}

if (w == user_id.size())

{

System.out.println("\nWe could not find your account");

System.out.print("1: New user\n2: Try again\nChoose an option: ");

int ch = sca.nextInt();

switch (ch)

{

case 1:

SignUp();

break;

case 2:

Login();

break;

}

}

}

void SignUp()

{

System.out.print("\n");

System.out.println("Create your account");

System.out.print("Email id: ");

String a = sc.next();

user_id.add(a);

System.out.print("Password: ");

String b = sc.next();

u[user_id.indexOf(a)] = new User(a, b);

}

}

class Seller extends User

{

ArrayList<String> seller_name = new ArrayList<>();

int j, k, q;

String s_name, s_location, c, seller, product_name;

int quantity;

double price;

int mango;

double mango_price;

int apple;

double apple_price;

int grapes;

double grapes_price;

int cherry;

double cherry_price;

int pear;

double pear_price;

Seller s[] = new Seller[100];

Seller() {
}

Seller(String s_name, String s_location)

{

this.s_name = s_name;

this.s_location = s_location;

}

void SignUp()

{

super.SignUp();

System.out.print("Name: ");

c = sc.next();

seller_name.add(c);

System.out.print("Location: ");

String d = sc.next().toLowerCase();

s[seller_name.indexOf(c)] = new Seller(c, d);

System.out.print("\nLogin");

Login();

}

void Login()

{

super.Login();

}

void Add()

{

int chs;

do {

System.out.print("\n");

System.out.print("1:ADD FRUITS \n2:LOGOUT\nChooose an option: ");

chs = sca.nextInt();

if (chs == 1)

{

System.out.print(
"1.Mango 🥭 \n2.Apple 🍎 \n3.Grapes 🍇 \n4.Cherry 🍒 \n5.Pear 🍐\nEnter name of the fruit you want to add: ");
System.out.print("\n");

String ch = sca.next();

String ch1 = ch.toLowerCase();

switch (ch1)

{

case "mango":

{

System.out.print("Enter Quantity (in kg): ");

s[z].mango = sca.nextInt();

System.out.print("Enter Price (per kg): ");

s[z].mango_price = sca.nextDouble();

System.out.println("\nFor Mangoes:");

System.out.print("Quantity: " + s[z].mango + " Kg\nPrice: " + s[z].mango_price + " Rupees\n");

break;

}

case "apple":

{

System.out.print("Enter Quantity (in kg): ");

s[z].apple = sca.nextInt();

System.out.print("Enter Price (per kg): ");

s[z].apple_price = sca.nextDouble();

System.out.println("\nFor Apples:");

System.out.print("Quantity: " + s[z].apple + " Kg\nPrice: " + s[z].apple_price + " Rupees\n");

break;

}

case "grapes":

{

System.out.print("Enter Quantity (in kg): ");

s[z].grapes = sca.nextInt();

System.out.print("Enter Price (per kg): ");

s[z].grapes_price = sca.nextDouble();

System.out.println("\nFor Grapes:");

System.out.print("Quantity: " + s[z].grapes + " Kg\nPrice: " + s[z].grapes_price + " Rupees\n");

break;

}

case "cherry":

{

System.out.print("Enter Quantity (in kg): ");

s[z].cherry = sca.nextInt();

System.out.print("Enter Price (per kg): ");

s[z].cherry_price = sca.nextDouble();

System.out.println("\nFor Cherry:");

System.out.print("Quantity: " + s[z].cherry + " Kg\nPrice: " + s[z].cherry_price + " Rupees\n");

break;

}

case "pear":

{

System.out.print("Enter Quantity (in kg): ");

s[z].pear = sca.nextInt();

System.out.print("Enter Price (per kg): ");

s[z].pear_price = sca.nextDouble();

System.out.println("\nFor Pear:");

System.out.print("Quantity: " + s[z].pear + " Kg\nPrice: " + s[z].pear_price + " Rupees\n");

break;

}

}

}

else

{

System.out.println("You have logged out!");

break;

}

}

while (true);

}

void Display(String y, int x)

{
System.out.print("\n");

String fruit_name = null;
j = 0;
k = 0;
q = 0;

double p = 0;

for (i = 0; i < seller_name.size(); i++)

{

if (y.equals(s[i].s_location))

{

if (x == 1)

{
if (s[i].mango == 0 || s[i].mango < 0) {

j = 1;
} else {
q = s[i].mango;

p = s[i].mango_price;

fruit_name = "mango";
System.out.print("Seller name: " + s[i].s_name + "Quantity: " + s[i].mango + " Kg\nPrice: "
+ s[i].mango_price + " Rupees per kg\n");
}
}

else if (x == 2)

{

if (s[i].apple == 0 || s[i].apple < 0) {
j = 1;
} else {

q = s[i].apple;

p = s[i].apple_price;

fruit_name = "apple";

System.out.print("Seller name: " + s[i].s_name + "Quantity: " + s[i].apple + " Kg\nPrice: "
+ s[i].apple_price + " Rupees per kg\n");
}
}

else if (x == 3)

{
if (s[i].grapes == 0 || s[i].grapes < 0) {

j = 1;
} else {

q = s[i].grapes;

p = s[i].grapes_price;

fruit_name = "grapes";
System.out.print("Seller name: " + s[i].s_name + "Quantity: " + s[i].grapes + " Kg\nPrice: "
+ s[i].grapes_price + " Rupees per kg\n");
}
}

else if (x == 4)

{
if (s[i].cherry == 0 || s[i].cherry < 0) {

j = 1;
} else {

q = s[i].cherry;

p = s[i].cherry_price;

fruit_name = "cherry";

System.out.print("Seller name: " + s[i].s_name + "Quantity: " + s[i].cherry + " Kg\nPrice: "
+ s[i].cherry_price + " Rupees per kg\n");
}
}

else if (x == 5)

{
if (s[i].pear == 0 || s[i].pear < 0) {

j = 1;

} else {
q = s[i].pear;

p = s[i].pear_price;

fruit_name = "pear";

System.out.print("Seller name: " + s[i].s_name + "Quantity: " + s[i].pear + " Kg\nPrice: "
+ s[i].pear_price + " Rupees per kg\n");
}
}

}

else {
k++;

}
}
if (q != 0) {
j = 0;
}

System.out.print("\n");
if (j == 1 || k == seller_name.size()) {
System.out.print("Not available for your location.");
System.out.print("\n");
} else {
System.out.print("Choose seller: ");

seller = sc.next();

System.out.print("Enter quantity: ");

quantity = sca.nextInt();
System.out.print("\n");

if (quantity > q)

{

System.out.print("Quantity not available.");

} else {

price = p;

product_name = fruit_name;
for (i = 0; i < seller_name.size(); i++) {
if (x == 1) {
s[i].mango -= q;
}
if (x == 2) {
s[i].apple -= q;
}
if (x == 3) {
s[i].grapes -= q;
}
if (x == 4) {
s[i].cherry -= q;
}
if (x == 5) {
s[i].pear -= q;
}
}

}
}

}

}

class Buyer extends User

{

ArrayList<String> buyer_name = new ArrayList<>();

ArrayList<String> cart_seller = new ArrayList<>();

ArrayList<String> cart_product = new ArrayList<>();

ArrayList<Double> cart_price = new ArrayList<>();

ArrayList<Integer> cart_quantity = new ArrayList<>();

int fruit, ch1;

String b_name, b_location, location;

Seller o = new Seller();

Buyer b[] = new Buyer[100];

Buyer() {
}

Buyer(String b_name, String b_location)

{

this.b_name = b_name;

this.b_location = b_location;

}

void SignUp()

{

super.SignUp();

System.out.print("Name: ");

String c = sc.next();

buyer_name.add(c);

System.out.print("Location: ");

String d = sc.next().toLowerCase();

b[buyer_name.indexOf(c)] = new Buyer(c, d);

System.out.print("\nLogin");

Login();

}

void Login()

{

super.Login();

location = b[z].b_location;

}

void Menu() {
System.out.print("\n");

System.out.print("1: Order\n2: Logout\nChoose an option: ");

ch1 = sca.nextInt();
}

void Order() {
System.out.print("\n");

System.out.print(
"What do you want to buy:\n1: Mango 🥭 \n2: Apple 🍎 \n3: Grapes 🍇 \n4: Cherry 🍒 \n5: Pear 🍐 \nChoose an option: ");

fruit = sca.nextInt();

}

void cart(String sell_name, int quant, double pri, String product)

{

cart_product.add(product);

cart_seller.add(sell_name);

cart_quantity.add(quant);

cart_price.add(pri);

}

void bill()

{

System.out.print("Order Summary: ");

System.out.print("\n");

double subtotal = 0;

for (int i = 0; i < cart_quantity.size(); i++)

{

subtotal += cart_quantity.get(i) * cart_price.get(i);

System.out.print("Seller: " + cart_seller.get(i) + "\nProduct: " + cart_product.get(i) + "\nQuantity: "
+ cart_quantity.get(i) + " kg\nPrice: " + cart_quantity.get(i) * cart_price.get(i) + " Rupees\n");

}
if (subtotal < 100)

{

subtotal = subtotal + 50;

}
System.out.print("\nSubtotal: " + subtotal + " Rupees");
System.out.print("\nChoose the mode of payment: ");

System.out.println("\n1: UPI Payment\n2: Credit/Debit Card\n3: Net Banking");

int ch = sca.nextInt();

System.out.println("\nYour payment is successfull!!");

System.out.println("Your order has been placed, you will soon get an email to track your parcel");

System.out.print("*🙏Thank you for visiting us🙏*");
System.out.print("\n");

}

void Logout() {
System.out.println("You have logged out!");
while (true) {
break;
}
}

}

public class Mini {

public static void main(String[] args) {

// TODO Auto-generated method stub

String choice = null, ch2 = null;
int r = 0, t = 0;

Scanner sc = new Scanner(System.in);

Seller s = new Seller();

Buyer b = new Buyer();

do

{
System.out.print("\n");

System.out.println("🙏 Welcome to Virtual Farmer Market 🙏");

System.out.print("Who are you?\n1: Seller\n2: Customer\nChoose an option: ");

int ch = sc.nextInt();

if (ch == 1)

{

System.out.print("\n1: Login\n2: New user\n3: Exit\nChoose an option: ");

choice = sc.next();

}

if (ch == 2)

{

System.out.print("\na: Login\nb: New user\nc: Exit\nChoose an option: ");

choice = sc.next();

}

switch (choice)

{

case "1":

s.Login();

s.Add();

break;

case "2":

s.SignUp();

s.Add();

break;

case "a":

b.Login();

b.Menu();

if (b.ch1 == 1) {
b.Order();
s.Display(b.location, b.fruit);
b.cart(s.seller, s.quantity, s.price, s.product_name);
for (b.i = 0; b.i < b.cart_quantity.size(); b.i++)
if (b.cart_quantity.get(b.i) != 0) {
b.bill();
break;
}
} else {
b.Logout();
break;
}

case "b":
b.SignUp();
b.Menu();
if (b.ch1 == 1) {
b.Order();
s.Display(b.location, b.fruit);
b.cart(s.seller, s.quantity, s.price, s.product_name);
for (b.i = 0; b.i < b.cart_quantity.size(); b.i++)
if (b.cart_quantity.get(b.i) != 0) {
b.bill();
break;
}
} else {
b.Logout();
break;
}

case "3":

System.exit(0);

case "c":

System.exit(0);

}

}

while (true);

}

}