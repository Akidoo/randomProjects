import webbrowser
import time
import random

while True:
    sites = random.choice(['youtube.com/watch?v=dQw4w9WgXcQ', 'youtube.com/watch?v=dQw4w9WgXcQ', 'youtube.com/watch?v=dQw4w9WgXcQ'])
    visit = "http://{}".format(sites)
    webbrowser.open(visit)
    seconds = random.randrange(1, 2)
    time.sleep(seconds)