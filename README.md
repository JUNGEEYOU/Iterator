
# 1. 이터레이터 패턴이란?

> 컬렉션 구현 방법을 노출시키지 않으면서도 그 집합체 안에 들어있는 모든 항목을 접근할 수 있게 해준다.

- 아래와 같이 클라이언트는 타입 상관 없이 두 인터페이스로만 접근하면 되므로 구체적인 타입을 알 필요가 없다.

![9%201/Untitled.png](/img/Untitled.png)

[https://refactoring.guru/design-patterns/iterator](https://refactoring.guru/design-patterns/iterator) 이미지 참고

### 사용 목적

- 클라이언트한테 객체들의 저장 방식을 모두 알려줘야할까요? 아닙니다. 클라이언트는 저장 방식을 알아서 접근하는 것은 불편합니다. 따라서 이터레이터 패턴을 사용해서 어떤 저장 방식이든 같은 방식으로 접근하게 하는 것이 좋습니다.


