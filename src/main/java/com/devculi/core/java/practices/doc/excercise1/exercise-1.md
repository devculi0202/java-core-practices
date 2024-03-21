
## Generic Types
1. Type parameters\
   In the class `Box<T>` T is ***type parameter***
   >   E - Element (used extensively by the Java Collections Framework)\
      K - Key\
      N - Number\
      T - Type\
      V - Value
2. Type argument\
   T in `Box<T>` is a ***type parameter*** and the String in `Box<String>` is a ***type argument***.
3. Raw type\
   For example, in the code
   ```java
   Box<Integer> intBox = new Box<>();
   ```
   You can create `intBox` as below, instead 
   ```java
   Box rawBox = new Box();
   ```
   Therefore, `Box` is the ***raw type***