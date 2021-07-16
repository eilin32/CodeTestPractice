#----bagic----

print(2**5)  # 2*2*2*2*2 = 32
print(2**3**2)  # 2**(3**2) = 2**9= 512
print(9**(1/2))  # 9의 루트 값 = 3.0 (항상 float값)

print(20//6)  # 3 (20을 6으로 나눈 몫 값)
print(20 % 6)  # 2 (20을 6으로 나눈 나머지 값)

#you are offered a choice of either $1.000.000 or $0.01 doubled every day for 30 days(the resulting amount is doubled every day)
#당신은 30일 동안 매일 $1.000.000 또는 $0.01 중 하나를 선택할 수 있습니다.(매일 2배의 총액)
#Write a program to calculate the amount that will result from the doubling to understand which choice results in a larger amount.
#프로그램을 작성하여 어떤 선택이 더 많은 양을 발생시키는지 파악합니다.

print(0.01*(2**30))

#----String----
print('brian\'s mother : he\'s not an angel.')  # \와 함께 쓰면 따옴표를 표시할 수 있다.

#\n = enter , \t = tap
print('hello \nworld')
print('hello \tworld')

#""" -> this makes it easier to format long, multi-line texts without the need to explicitly put \n for line breaks
print("""this 
is a 
multiline 
text""")
#this
#is a
#multiline
#text

print("spam"*3)  # spamspamspam
print(3*'7')  # 777

this_is_a_normal_name = 7
#123abc = 7
#SyntaxError: invalid syntax

x = input()
print(x)

name = input("What is your name?")
print("hi "+name)

age = int(input("How old you?"))
print(name+" is "+age)

c = "a"
c *= 3
print(c)  # aaa

num = int(input())
print(num)

#print(num:=int(input())) 3.8버전 새로운 기능

#Write a program to take two integers as input and output their sum
#Sample Input: 2 8
#Sample Output: 10

x = int(input())
y = int(input())
print(x+y)

# == boolean
# != comparison (a와 b가 다른가 ? 같으면 false 다르면 true)
# < > <= >=
# spring 끼리 비교할 경우 알파벳 순서로 크기를 재며, annie, andy 중 n이 d보다 뒤에 오므로 annie가 크다고 할 경우 true가 나온다.

print("Annie" > "Andy")

# if 조건:
#			실행문
# elif 조건:
#			실행문
# else:
#			실행문

# Boolean Logic
# and, or, not (&&, ||, !)
