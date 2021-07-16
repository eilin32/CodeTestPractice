# list = ["a","b","c"]
# print(list[0]) => a

empty_list = []
print(empty_list)  # [] 요소가 없음. null

str = "Hello world!"
print(str[6])  # w Space(" ") is also a symbol and has an index.

nums = [1, 2, 3]
print(nums + [4, 5, 6])  # [1,2,3,4,5,6]
print(nums * 3)  # [1,2,3,1,2,3,1,2,3]

# List Operations
words = ["spam", "egg", "spam", "sausage"]
print("spam" in words)  # True
print("tomato" in words)  # False

nums = [1, 2, 3]
print(not 4 in nums)  # True
print(4 not in nums)  # True
print(not 3 in nums)  # False
print(3 not in nums)  # False

# list 요소 추가하기 (1) ***
nums.append(4)
print(nums)

# list 길이 ***
print(len(nums))

# list 요소 추가하기 (2) ***
words = ["python", "fun"]
index = 1
words.insert(index, "is")  # index 자리에 ""부분을 추가한다
print(words)  # ['python', 'is', 'fun']

# list 해당 요소 index 찾기
print(words.index("fun"))  # 2

# 무한루프
i = 0
while True:
	i = i+1
	if i >= 5:
		print("Breaking")
		break

print("Finished")

# Using the "continue" statement out side of a loof an error
i = 1
while i <= 5:
	print(i)
	i += 1
	if i == 3:
		print("skipping 3")
		i += 1
		continue

# for 문
words = ["hello", "world", "spam", "eggs"]
for word in words:  # word는 임의의 index 요소 역할
	print(word + "!")

# for loops
str = "testing for loops"
count = 0

for x in str:
	if(x == 't'):
		count += 1

print(count)

lists = [2, 3, 4, 5, 6, 7]
for x in lists:
	if(x % 2 == 1 and x > 4):  # x를 2로 나눈 나머지가 1이고 4보다 큰 숫자
		print(x)  # 5
		break

# It is common to use the for loop when the number of iteration is fixed.
# For example, iterating over a fixe list of items in a shopping list.
# The while loop is used in cases when the number of iterations is not known
# and depends on some calculations and conditions in the code block of the loop.
# For example, ending the loop when the user enters a specific input in a calculator program

# Both, for and while loops can be used to achieve the same results,
# however, the for loop has cleaner and shorter syntax, making it a better choice in most cases.

# range ***
numbers = list(range(10))  # 0부터 10전까지의 숫자 리스트 나열
print(numbers)  # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

A = list(range(3, 8))  # [3,4,5,6,7] 3부터 8전까지의 숫자 리스트 나열
print(A)

print(range(20) == range(0, 20))  # True

B = list(range(5, 20, 2))  # [5, 7, 9, 11, 13, 15, 17, 19] 5부터 20전까지 2씩 증가
print(B)

# 거꾸로 20부터 5까지 2씩 감소하는 함수 range(20,5,-2)

# The for loop is commonly used to repeat some code a certain number of times.
# This is done by combining for loops with range objects.
# You don't need to call list on the range object when it is used in a for loop,
# because it isn't being indexed, so a list isn't required

for i in range(5):
	print("hello!")

#Q. what does this code do?

for i in range(10):
	if not i % 2 == 0:  # 홀수일 때
		print(i+1)  # 홀수 + 1 값을 출력(최소 1+1, 최대 9+1)

#결과적으로 2부터 10까지 짝수가 나오게 됨

#-------------problem-----------
# FizzBuzz is a well known programming assignment, asked during interviews.
# The given code solves the FizzBuzz problem and uses the words 'Solo' and 'Learn' instead of 'Fizz' and 'Buzz'
# It takes an input n and outputs the numbers from 1 to n
# For each multiple of 3, print "Solo" instead of the number
# For each multiple of 5, prints "Learn" instead of the number
# For numbers which are multiples of both 3 and 5, output"SoloLearn"

# You need to change the code to skip the even numbers, so that the logic only applies to odd numbers in the range.

n = int(input())

for x in rang(1, n, 2):
	if x % 3 == 0 and x % 5 == 0:
		print("SoloLearn")
	elif x % 3 == 0:
		print("Solo")
	elif x % 5 == 0:
		print("Learn")
	else:
		print(x)
