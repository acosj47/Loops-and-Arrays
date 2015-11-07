// Learning to make Arrays 
// by Justin Acosta

// create 2 arrays both containing the numbers 1-10
// fill one array manually
// fill the second array with a loop

void setup(){
 size(600, 400); 
}

void draw(){
 background(0, 100, 150);
 showArray1();
 showArray2();
}
//array 1, filled manually
void showArray1(){  
int [] numbers = new int[10];   // declared an array of integers, iniialize with 10 indices

numbers[0] = 1;     //  All indices filled manually one by one.  Not fun.
numbers[1] = 2;
numbers[2] = 3;
numbers[3] = 4;
numbers[4] = 5;
numbers[5] = 6;
numbers[6] = 7;
numbers[7] = 8;
numbers[8] = 9;
numbers[9] = 10;

 fill(255);
 textSize(20);
 text(numbers[2], width/2, height/2);  // displays the integer in the defined index

}
// array 2, filled by a loop
void showArray2(){
 int [] numbers = new int[10]; //declared an array of integers, with 10 indices same as above 
 for(int i = 0; i < 10; i++){  // this array is filled by a loop
   numbers[i] = i + 1;   //the number of the index and its value increase by 1 each loop 
   ;
 }
 fill(255, 255, 0);                       // the text from the looped array is yellow
 text(numbers[2], width/2, height*3/4);   //displays the integer in the index 
}

