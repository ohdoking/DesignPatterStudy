# DesignPatterStudy
디자인 패턴 스터디 후 실습을 목적으로 만든 프로젝트이다.


## 객체 지향의 원칙
1. 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로 부터 분리시킨다.
	- 바뀌는 부분은 캡슐화한다.	
2. 구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.
	- duck의 행동은(특정 행동 인터페이스를 구현한) 별도의 클래스 안에 들어있게 됩니다.
	그렇게 하면 duck 클래스에서는 그 행동을 구체적으로 구현하는 방법에 대해서는 더이상 알고 있을 필요가 없다.
3. 상위 형식에 맞춰서 프로그래밍하라
	- 변수를 선언할 때는 보통 추상 클래스나 인터페이스 같은 상위 형식으로 선언 해야한다.
	 객체를 변수에 대입할 때 상위 형식을 구체적으로 구현한 형식이라면 어떤 객체든 집어넣을 수 있기 때문이다.
	그렇게하면 변수르 선언하는 클래스에서 실제 객체의 형식을 몰라도 된다.
4. 상속보다는 구성(Composition)을 활용한다.
	- 상속 받는 대신 올바른 행동 객체로 구성됨으로써 행동을 부여받는것.    


## Strategy Pattern(전략 패턴)

알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다. 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.

![Strategy Pattern Image](http://www.dofactory.com/images/diagrams/net/strategy.gif)

### 적용된 예제(in JDK)

- java.util.Comparator#compare() called by Collections.sort()

> 컬렉션 객체들에 대해서 sort를 할때는 객체의 어떤 값을 기준으로 객체간의 비교를 정할지를 정하는 알고리즘이 필요하다.
그래서 아래처럼 미리 전략을 구성하고, 구성된 전략을 감싸주는 Comparator 인터페이스안에 로직을 넣어 감싸준뒤, 실제 대상 함수인 sort에 배열객체와 함께 알고리즘이 포함된 Comparator 객체를 넘겨주면, 실제 sort함수가 불릴때는 comparator 알고리즘에 따라 정렬을 수행한다.

``` java 
  Comparator<Child1> sort = new Comparator<Child1>() {
   public int compare(Child1 o1, Child1 o2) {
    return o2.getOrder().compareTo(o1.getOrder());
   }
  };
  Collections.sort(list, sort); 
```
 
- javax.servlet,http.HttpServlet#service

> 웹프로그래밍이야 말로 대표적인 전략패턴방식의 프로그래밍을 하는것이라 볼수 있다. 
톰캣은 하나의 jvm인스턴스에서 돌아간다. 톰캣위에서는 여러개의 웹서비스가 동시에 동작하고 있다. 
url request가 오면 port와 url context에  따라 거기에 맞는 각각의 웹서비스의 service()함수가 불리게 된다. 
이때 service함수는 유저가 직접 작성한 것이 수행되게 된다. 여기서 service가 전략이 된다.
톰캣입장에서 볼때는 전략 패턴의 방식으로 url을 처리하는 것이다.


- javax.servlet.Filter#doFilter

> url에 대해 유저가 처리하는 함수 service()를 부르기전, 유저가 주입한 filter에 따라서 url이 처리될수도 있고, 거절될수도 있고, 특정 page로 direct 될수도 있다. 이것또한 tomcat입장에서 볼때 전략패턴의 방식으로 url을 필터링하는 것이다.



### 참고 
- HeadFirst DesignPattern book
- http://hyeonstorage.tistory.com/146# DesignPatterStudy
- http://m.blog.naver.com/2feelus/220658663151
