import art
from art import logo
import random
print(logo)


print("***** \U0001f600   Welcome to the Guessing game  \U0001f600 *****\n")

print("Hmmm\U0001F914\U0001F914....I am thinking of a number between 1 and 100")

num_comp=random.randint(1,100)


print("\n")

level=input("Choose a difficulty level, type :'easy' or 'hard' => ").strip().lower()




if level=='easy':
    num_trials=10
elif level=='hard':
    num_trials=5
else:
    print("\nInvalid value entered :( ")
    
while num_trials!=0:
    print("You have ",num_trials,"trials to guess...\U0001f609 ")
    guess=int(input("Make a guess: ").strip().lower())
    num_trials=num_trials-1
    if guess==num_comp:
        print(f"\nHurray \U0001f600\U0001f600! You won\n\n ***** Your guess {guess} is correct \U0001f389\U0001f389  ***** ")
        exit()
    elif guess>num_comp:
        print("Too high.\nGuess again !\U0001f922")
    elif guess<num_comp:
        print("Too low.\nGuess again !\U0001f922")
        
    
    