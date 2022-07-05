class Room{
  int length, breadth;
  Room(int l,int b){
    length = l;
    breadth = b;
  }
  int area(){
    return length*breadth;
  }
}
class BedRoom extends Room{
  int height;
  BedRoom(int x,int y, int z){
    super(x,y);
    height = z;
  }

  int volume(){
    return length*breadth*height;
  }
}
class Single{
  public static void main(String args[]){
    BedRoom Room1 = new BedRoom(10,20,30);
    int area1 = Room1.area();
    int volume1 = Room1.volume();
    System.out.print("Area = "+area1 + " Volume = "+ volume1);
  }
}