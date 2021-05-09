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
