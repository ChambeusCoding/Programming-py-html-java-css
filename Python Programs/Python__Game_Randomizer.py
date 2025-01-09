import random

# List of games
game = ['Hoi4', 'ApexLegends', 'Tom Clancys Rainbow Six Siege', 'Randomly code', 'Unfortunately get some work done', 'Do my Podcast']

# Pick a random game
random_ = random.choice(game)
print(random_)

if random_ == 'Unfortunately get some work done':
    print('Are you sure?')
    print('NEVER')
elif random_ == 'Hoi4':
    print('Wow that on thing I actually want to do')
elif random_ == 'Randomly code':
    print('Isnt that what im literally doing right now?')
elif random_ == 'Apex Legends' or 'Tom Clancys Rainbow Six Siege':
    print('I mean , I guess')
elif random_ == 'Do my Podcast':
    print('No time')
