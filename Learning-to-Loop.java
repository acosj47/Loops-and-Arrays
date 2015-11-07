// Learning how to code loops
// by Justin Acosta

// Make multiple circles, squares, and rectangles using loops
// Make each with a different type of loop(while/for, count/event controlled)
// Make them move and bounce of walls

//Globals
float redX, redY, redDX;            
float greenX, greenY, greenDX;
float yellowX, yellowY, yellowDX;

//starting size 600 x 400
void setup() {
  size(600, 400);
  redX = width/4;       //circle position
  redY = 15;
  redDX = 3;           // circle speed
  greenX = width/2;    // square position
  greenY = 0;      
  greenDX = 3;         // square speed
  yellowX = width*3/4; // rectangle position
  yellowY = 0;
  yellowDX = 3;        // rectangle speed
}

void draw() {
  background(100, 150, 200); 
  showRedBall(redX, redY, 30, 30);
  showGreenSquare(greenX, greenY, 30, 30);
  showYellowRectangle(yellowX, yellowY, 40, 20);
  move();
  bounce();
}
// show red balls made by an event controlled, while loop
void showRedBall(float x, float y, float w, float h) {
  /* this loop is event controlled.  
  It will continue until the circles reach the bottom of the screen.
  Since it is based on height, it will loop to the bottom even if size is changed.
  By changing the size(height) you can see the difference between the count and
  event controlled loops*/
  
  while (y < height) {  // the loop will continue until the circles reach the bottom
    fill(255, 0, 0);    
    ellipse(x, y, w, h);
    y += 45; // the spacing between the circles, lower spacing makes more circles.
  }            
  
}
// show green sqaures made by a count controlled, while loop
void showGreenSquare(float x, float y, float w, float h) {
  int i = 0;  // count for the while loop

  while ( i < 10) {  // this loop is count controlled, it will make 10 squares
    fill(0, 255, 0);
    rect(x, y, w, h);
    y += 40;  // the spacing between squares
    i++;  //increments the count by 1 each loop      
  }
}
//shows yellow rectangles made with a count controlled, for loop
void showYellowRectangle(float x, float y, float w, float h) {
  for (int i = 0; i < 10; i++) { //count starts at 0, test count, increment count + 1
    fill(255, 255, 0);
    rect(x, y, w, h);
    y += 40;  // spacing for rectangles
  }
}
// move the shapes left and right
void move() {
  redX += redDX;
  greenX += greenDX;
  yellowX += yellowDX;
}
//bounce shapes off left and right walls
void bounce() {
  if (redX > width - 15 || redX < 15) {
    redDX *= -1;
  }
  if (greenX > width - 30 || greenX < 0) {
    greenDX *= -1;
  }
  if (yellowX > width - 40 || yellowX < 0) {
    yellowDX *= -1;
  }
}
