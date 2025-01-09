import re
import sys
import password_strength
password = "PointBreak"
def is_valid_password(password):
    if len(password) < 8:
        return False
    if not re.search(r'[a-z]', password):
        return False
    if not re.search(r'[A-Z]', password):
        return False
    if not re.search(r'[0-9]', password):
        return False
    if not re.search(r'[@$!%*?&]', password):
        return False
    return True

def password_confirmation(password, confirmation):
    if password != confirmation:
        return False, "Passwords do not match."
    return True, "Passwords match."

# Ask the user to input their password and confirm it
password = input("Scanning: ")
confirmation = input("Welcome?") 

# Check if the passwords match
match, match_message = password_confirmation(password, confirmation)
if not match:
    print(match_message)
    sys.exit()  # Exit the program if the passwords do not match

# Validate the password
valid, message = is_valid_password(password)
if valid:
    print(f"Access Granted! Welcome PointBreak.")
else:
    print(f"Access Denied: WASTER")
    sys.exit()

#Convertion from meters to other lengths
def calc_kilometers(meters):
    return meters * 0.001

def calc_inches(meters):
    return meters * 39.37

def calc_feet(meters):
    return meters * 3.281
#Dislpays the menu of choices  
def show_menu():
    print("1. Option 1")
    print("2. Option 2")
    print("3. Option 3")
    print("4. Option 4")

def main():
    meters = 500
    number = 0 
    
    while number < 1 or number > 4:
        number = int(input("PICK 1-4 NOW!!!: "))
        print("Can't do that sigma")
        
# While loop that continues until number equals 4
    while number != 4:
        show_menu()  # Calling the function to show the menu
        number = int(input("Enter your choice: "))  # Taking user input and converting it to an integer
    
 
        if number == 1:
            kilometers = calc_kilometers(meters)  # Call the function to convert to kilometers
            print(f"Kilometers: {kilometers}")
        elif number == 2:
            inches = calc_inches(meters)  # Call the function to convert to inches
            print(f"Inches: {inches}")
        elif number == 3:
            feet = calc_feet(meters)  # Call the function to convert to feet
            print(f"Feet: {feet}")
        elif number == 4:
            print("Exiting Program")
            break 
        
if __name__ == "__main__":
    main()