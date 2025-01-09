astro_name = input('Plz enter the name of the Astronaut: ')
course = astro_name
print(course.upper())

letter_counting = input('Plz enter the letter you want counted: ')

number = 0

for counter in range(len(astro_name)):
    if astro_name[counter].lower() == letter_counting.lower():
        number += 1
str(number)

print(f'The letter {letter_counting} appeared {number} times.')