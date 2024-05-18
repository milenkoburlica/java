package org.milenkoburlica;

public class Caller implements ICallback {

  Callee callee = new Callee(this);
  @Override
  public void notifyCaller() {
    // TODO Auto-generated method stub
    System.out.println("Thank you Callee for executing my task ...");
    System.out.println("Now I will take data nad process ...");
  }

  public void callAsynctaskOfCallee() {
     callee.asynchnronousTask(); 
  }
}
