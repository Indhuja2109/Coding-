import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    #shape attribute of DataFrame player is accessed to get its dimensions
    [r,c] = players.shape #returns a tuple
    return[r,c]