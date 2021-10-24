# One person has two jobs to perform, one on Tuesday and one on Thursday
# If both jobs go well, he has promised that he will buy a 50 inch TV
# If only one of the jobs go well, he will buy a 32 inch TV
# If none of then go well, he will buy anything

tuesday_job: str
thursday_job: str

tuesday_job = input("\n\tTuesday job went well? (True/False) ")
thursday_job = input("\n\tThursday job went well? (True/False) ")

if tuesday_job == "True" and thursday_job == "True":
    print("\n\tHe will buy a 50 inch TV!\n")

elif tuesday_job == "True" and thursday_job == "False":
    print("\n\tHe will buy a 32 inch TV!\n")

else:
    print("\n\tHe will buy anything...\n")