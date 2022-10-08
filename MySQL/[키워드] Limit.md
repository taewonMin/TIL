# limit

가장 상위 n개의 레코드만 조회할 경우 사용한다.

```sql
// 상위 한 개만 조회
select name
from animal_ins
order by datetime
limit 1;
```

offset을 이용하여 특정 인덱스부터 특정 개수만 조회할 수 있다.

```sql
// 5번째 데이터부터 10개 조회 (인덱스 0시작)
select name
from animal_ins
order by datetime
limit 4, 10;
```

그런데 데이터의 개수가 십만개 이상 넘어가는 경우 성능 저하가 생길 수 있다. 이를 해결하기 위해 인덱스를 이용한다.

[MySQL LIMIT 최적화(feat. 구글이 검색결과를 최대 1,000건만 제공하는 이유)](https://jeong-pro.tistory.com/244)
