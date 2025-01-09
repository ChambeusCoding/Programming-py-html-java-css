def get_length():
    """Prompts the user for the landing zone's length."""
    length = float(input("Enter the landing zone's length in feet: "))
    return length

def get_width():
    """Prompts the user for the landing zone's width."""
    width = float(input("Enter the landing zone's width in feet: "))
    return width

def get_area(length, width):
    """Calculates the landing zone's area."""
    return length * width

def display_data(length, width, area):
    """Displays the landing zone's length, width, and area."""
    print(f"The Landing zone's dimensions are as follows:")
    print(f"Length  = {length}")
    print(f"Width = {width}")
    print(f"Area  = {area}")

def main():
    # Get the landing zone's width and length from the user
    width = get_width()
    length = get_length()

    # Calculate the area of the landing zone
    area = get_area(length, width)

    # Display the landing zone's data
    display_data(length, width, area)

# Run the program
if __name__ == "__main__":
    main()