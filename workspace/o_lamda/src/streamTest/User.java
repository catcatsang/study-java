package streamTest;

import java.util.Objects;

public class User {
private String name;
private   int age;
private int id;

public User() {
}

public User(String name, int age, int id) {
   super();
   this.name = name;
   this.age = age;
   this.id = id;
}

public String getName() {
   return name;
}

public void setName(String name) {
   this.name = name;
}

public int getAge() {
   return age;
}

public void setAge(int age) {
   this.age = age;
}

public int getId() {
   return id;
}

public void setId(int id) {
   this.id = id;
}

@Override
public String toString() {
   return "User [name=" + name + ", age=" + age + ", id=" + id + "]";
}

@Override
public int hashCode() {
   return Objects.hash(name);
}

@Override
public boolean equals(Object obj) {
   if (this == obj)
      return true;
   if (obj == null)
      return false;
   if (getClass() != obj.getClass())
      return false;
   User other = (User) obj;
   return Objects.equals(name, other.name);
}
}
