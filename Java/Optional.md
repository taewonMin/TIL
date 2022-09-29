# Optional&lt;T&gt;

- 객체가 Null일 수 있는 경우에 Optional로 감싸서 return 하는 것이 일반적이다.
```java
public Optional<Member> findById(Long id) {
    return Optional.ofNullable(store.get(id));
}
```

- 객체를 꺼낼 때는 `.get()` 보다는 `.orElseGet()` 을 사용하여 Null일 경우에 대한 처리를 하여 return 한다.
- 조건 비교를 if문 대신 `ifPresent()` 메소드를 사용할 수 있다.
```java
private void validateDuplicateMember(Member member) {
		/** if문
		Optional<Member> result = memberRepository.findByName(member.getName());
    if(result.isPresent()){
        throw new IllegalStateException("이미 존재하는 회원입니다.");
    }
		**/

    memberRepository.findByName(member.getName())
            .ifPresent(member1 -> {
                throw new IllegalStateException("이미 존재하는 회원입니다.");
            });
}
```

