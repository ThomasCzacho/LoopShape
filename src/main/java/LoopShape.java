public class LoopShape {

    static void createRectangle(int width, int height){
        //Draw a Rectangle
        int h=1, w=0;
        width-=1;
while(height+1!=h && width+1!=w){
    if (w==width){
        w=0;
        h++;
        System.out.print("#\n");
        continue;
    }
else if (h==height || h==1){ //top bottom border

    System.out.print("#");
    w++;
    continue;
}
else if(w==0 || w==width){    //body

    if(w==width){
        System.out.print("#"); //last # in border, continue to next line

    } else{
        System.out.print("#");
        w++; continue;}
}
else{
    System.out.print(" "); w++;continue;
}
}


// three loops, 1=Top to Bottom, 2=Witihin 1, left to right, 3=within 1, left to right,
// loops 2 and 3 are decided between with if statement
// loop 3 responsible for body sections, needs if statement for first and last chars
    }

    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle


    }
}
//must print left to right
//must print top to bottom
// h is current row, starting at 1, goes up to (height)
// w is current column, starting at 0 goes up to (width)
// when w==width but h==height, w=0, h++, to start a new line


//first and last lines of rectangle (h==1,h==height) solid lines. ######
//body lines of rectangle (h>1, h<height) end caps with empty line between. #   #

//program ends when h==height && w==width

//rectangle has 3 distinct modules, top border, bottom border, and body.
// top and bottom border can potentially use the same code as they are identical

// h==1 || h==height then make border
//h>1 || h<height then make body
//h==height && w==width finish loop

// three loops, 1=Top to Bottom, 2=Witihin 1, left to right, 3=within 1, left to right,
// loops 2 and 3 are decided between with if statement
// loop 3 responsible for body sections, needs if statement for first and last chars




// first attempt

//    int h=1,w=0;
//while(height!=h && width+1!=w){
//
//        if(w==width+1){ //if max width
//        w=0; //reset to first line
//        h++; //go down one line
//        w*=0;
//
//
//        }else
//
//        if(h>1 && h<height){ //body of rectangle
//        if (w==0 || w==width-1) { //left and right borders
//        System.out.print("#");
//        w++;
//
//
//        }
//        else {
//        System.out.print(" ");
//        w++;
//        }
//        }
//        else if (w!=width) { //top and bottom of rectangle
//        System.out.print("#");
//        w++;
//
//        continue;
//        }
//        else {
//        System.out.print("\n");
//        w=0; //reset to first line
//        h++;
//
//        }
//        }