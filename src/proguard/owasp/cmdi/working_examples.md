Files marked as "Works without modification": 17, 176, 177, 302, 308, 310, 658, 659, 826

Overall number of cmdi - 78; number of successful ones (without modifications): 9

There are two main reasons of failure:
* addition of tainted data to an array/list does not make the list tainted -> data from the list is not considered tainted
* if an array is tainted then the data extracted from it must be tainted too, but it isn't. bug with arrays. collections work fine in such cases.