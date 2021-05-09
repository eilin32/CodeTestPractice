# Code Test Practice

코딩 테스트 연습하면서 공부한 알고리즘 코드들 모아 놓는 곳

2021.05.09  
- level1/poketmon.py

포켓몬 문제  

중복된 수가 N개 포함된 배열을 입력받고 그 중 N/2개의 요소를 선택했을 경우  
서로 다른 요소의 최댓수 구하기

더 좋은 다른 사람 코드
>def solution(nums):  
    return min(len(nums)/2, len(set(nums)))

- level1/maraton.py  

완주하지 못한 마라톤 선수  

<< 1번 트라이 >>
1. 딕셔너리함수를 이용해 participant와 completion 요소 중복 개수를 구하기 위해 for문으로 각 딕셔너리 countP와 countC에 value값을 1씩 더함  
> for j in completion:  
        try: countC[j]+=1  
        except: countC[j]=1  
2. countP와 countC의 key와 value를 서로 비교  
    *countP에는 있지만 countC에 없는 key값  
    *countP의 key값이 모두 countC에 있는 경우 중 value값이 다른 key값(중복된 경우)  
> for x in countP:  
        if not x in countC:  
            answer = x  
        else:  
            for y in countC:  
                if x== y:  
                    if not countP.get(x) == countC.get(y):  
                        answer = x  
3. __but ! 정확성은 모두 맞았지만 효율성은 모두 실패__
