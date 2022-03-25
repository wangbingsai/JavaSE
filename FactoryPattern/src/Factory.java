import imp.Animal;
import impdao.Cat;
import impdao.Dog;

public class Factory {
  public Animal getFactory(String str){
      if(str==null){
          return null;
      }
      if(str=="dog"){
          return new Dog();
      }else if(str=="cat"){
          return new Cat();
      }
          return null;
  }
}
