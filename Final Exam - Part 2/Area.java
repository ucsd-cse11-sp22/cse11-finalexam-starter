import tester.*;

interface Shape {

    // Task 3: your code here

}
  
class Square implements Shape {
  int base; 
  
  Square(int base) {
    this.base = base;
  }
    
  // Task 3: your code here
  
}
  
class Circle implements Shape {
  int radius;
  double pi = 3.14;

  Circle(int radius) {
    this.radius = radius; 
  }

    // Task 3: your code here

}
  
class Triangle implements Shape {
  int height;
  int base;

  Triangle(int height, int base) { 
    this.height = height; 
    this.base = base; 
  }

    // Task 3: your code here

}


class Trapezoid implements Shape {
  int top_base;
  int bottom_base;
  int height;

  Trapezoid(int top_base, int bottom_base, int height) {
    this.top_base= top_base;
    this.bottom_base=bottom_base;
    this.height=height;
  }
   
   // Task 3: your code here

}