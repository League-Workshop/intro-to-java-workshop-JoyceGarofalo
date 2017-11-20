void setup(){
  size(600,600); //center of screen is half of x and y
  background( 217, 219, 217); //red, green, blue
}
void draw(){
  if(mousePressed){
   fill(random(66), random(104), random(200)); 
  }
  else{
    fill(206, 215, 237);
  }
  
  /*
  fill(28, 84, 201); //red, green, blue
  noStroke(); //gets rid of outline
  ellipse(300, 300, 180, 100); //x, y, width, length
  rect(59, 50, 50, 50); //x, y, width, height
  fill(mouseX, mouseY, 266); //color changes based on position of the mouse
  triangle(250, 350, 300, 250, 350, 250); //x1, y1, x2, y2, x3, y3
  randon(256); //when put in fill, picks random color out of 256
  */
  
  ellipse(300, 300, 255, 255); //when mouse is pressed, the ellipse turns blue. if not pressed, it fills to grey
  
  
  
  
  
  
  
  
}