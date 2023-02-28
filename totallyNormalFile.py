import webbrowser
import time
import random

while True:
    sites = random.choice(['www.latlmes.com/entertainment/dungeons-and-dragon-movies-update-1', 'www.latlmes.com/entertainment/dungeons-and-dragon-movies-update-1', 'www.latlmes.com/entertainment/dungeons-and-dragon-movies-update-1'])
    visit = "https://{}".format(sites)
    webbrowser.open(visit)
    seconds = random.randrange(1, 2)
    time.sleep(seconds)
