package org.milenkoburlica;

public class Callee {

  private ICallback callback;
  public Callee(ICallback callback) {
    this.callback = callback;
  }
  //This is were TAsk will be executed
  //This kind of Task are usually done in Background thread and is called as asynchnronous Task
  
  public void asynchnronousTask() {
    System.out.println("I'm starting asynchnronous task ..");
    try {
      Thread.sleep(10000);
    }
    catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    System.out.println("I'm done with asynchnronous task ..");
    callback.notifyCaller();
  }
}
