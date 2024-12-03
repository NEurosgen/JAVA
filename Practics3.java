class A {
    int a;
    int b;
    int c;
    int z;
  
    public A() {
      this(1, 0, 0);  // Вызов другого конструктора с дефолтными значениями
    }
  
    public A(int a) {
      this(a, 0, 0);  // Вызов конструктора с одним параметром
    }
  
    public A(int a, int b) {
      this(a, b, 0);  // Вызов конструктора с двумя параметрами
    }
  
    public A(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
      z = 1;
    }
    ...
  }
  