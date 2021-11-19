cards = ' '
cards1 = ' '
while cards != 0 and cards1!=0:
    cards, cards1 = input().split()
    line = input().split()
    line1 = input().split()
    cards = set(line)
    cards1 = set(line1)
    mem = cards1
    if len(cards) < len(cards1):
        mem = cards
        cards = cards1
    mem = [x for x in mem if x not in cards]
    print(len(mem))