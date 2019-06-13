#自实现类aop
核心 使用 jdk 的Proxy.newProxyInstance 方法来实现的
```java
return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new MyInvocationHandler(target, interceptor));
```