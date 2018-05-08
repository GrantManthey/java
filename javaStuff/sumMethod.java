class SumObject{
  int sumMethod(int v){
    if (v <=1){
      return 1;
    }else{
      System.out.print(".");
      return (v+(sumMethod(v-1)));
    }
  }
}
