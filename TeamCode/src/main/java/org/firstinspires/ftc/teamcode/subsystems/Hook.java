package org.firstinspires.ftc.teamcode.subsystems;
import com.qualcomm.robotcore.hardware.Servo;

public class Hook {
    Servo hook;
    
   
    
    public Hook(Servo hook) {
        
        this.hook = hook;
    }

    public Servo getHook() {
        
        return hook;
    }

    public void setHook(Servo hook) {
         
        this.hook = hook;
    }
    
   public void setPosition(position) {
       
       if (position < 0) {
           position = 0;
       }
       else if (position > 1) {
           
           position = 1;
       }         
               
}
