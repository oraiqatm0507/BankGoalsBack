# BankGoalsBack

For debugging you should do the following. 

1. Download the project and run
2. Open web browser and go to:  http://localhost:8080/graphiql?path=/graphql 
3. Copy and paste the following to provide data to the database:

#recipient 1: 091823812-1298312
#recipient 2: 034223412-6345312
query {

  goal1:MG_addGoal(goalInfo: {
    id: "goal-1"
    name: "Save Big Money",
    goalMsg: "Make as much money as I can before the end of the year.",
    goalOwner: "1"
    startDate: "2022-09-13"
    endDate: "2022-12-25"
    startingInstallment: 30000
    currentBalance: 400000
    goalBalance: 700000
    reminderBuffer: "Bi-Weekly"
    goalColor: "#FFFFF"
    estimatedDurationOfGoal: "3 months"
    preferredGoalDuration: "3 months"
    aquiredAmount:10000
    goalType: SAVING
    accountType: CHECKING
    isCompleted: false
    recipientId: "1"
  }) {
    goalMsg
  }
  goal2:MG_addGoal(goalInfo: {
    id: "goal-2"
    name: "Pay Mom Back",
    goalMsg: "I barrowed money from mom, need to pay back by the end of the month",
    goalOwner: "1"
    startDate: "2022-09-13"
    endDate: "2022-09-30"
    startingInstallment: 7000
    currentBalance: 400000
    goalBalance: 7000
    reminderBuffer: "weekly"
    goalColor: "#FFFFF"
    estimatedDurationOfGoal: "1 week"
    preferredGoalDuration: "1 week"
    aquiredAmount:1000
    goalType: PAYMENT
    accountType: CHECKING
    isCompleted: false
    recipientId: "2"
  }) {
    goalMsg
  }
  goal3:MG_addGoal(goalInfo: {
    id: "goal-3"
    name: "Save for new car!",
    goalMsg: "Save for a brand new Auddi R8.",
    goalOwner: "1"
    startDate: "2022-09-13"
    endDate: "2023-09-13"
    startingInstallment: 30000
    currentBalance: 400000
    goalBalance: 120000
    reminderBuffer: "every month"
    goalColor: "#FFFFF"
    estimatedDurationOfGoal: "1 year"
    preferredGoalDuration: "1 year"
    aquiredAmount:5000
    goalType: SAVING
    accountType: CHECKING
    isCompleted: false
    recipientId: "1"
  }) {
    goalMsg
  }
  goal4:MG_addGoal(goalInfo: {
    id: "goal-4"
    name: "Pay Friend",
    goalMsg: "I owe my friend a bit of money.",
    goalOwner: "1"
    startDate: "2021-02-01"
    endDate: "2030--2-01"
    startingInstallment: 2000
    currentBalance: 400000
    goalBalance: 1000000
    reminderBuffer: "every month"
    goalColor: "#FFFFF"
    estimatedDurationOfGoal: "18 years"
    preferredGoalDuration: "5 years"
    aquiredAmount:500000
    goalType: PAYMENT
    accountType: CHECKING
    isCompleted: false
    recipientId: "3"
  }) {
    goalMsg
  }
  goal5:MG_addGoal(goalInfo: {
    id: "goal-5"
    name: "Save for Wedding",
    goalMsg: "Getting married soon, I got to save some money for the wedding.",
    goalOwner: "1"
    startDate: "2020-04-12"
    endDate: "2023-04-12"
    startingInstallment: 2000
    currentBalance: 400000
    goalBalance: 20000
    reminderBuffer: "every month"
    goalColor: "#FFFFF"
    estimatedDurationOfGoal: "3 years"
    preferredGoalDuration: "3 years"
    aquiredAmount:10000
    goalType: SAVING
    accountType: CHECKING
    isCompleted: false
    recipientId: "1"
  }) {
    goalMsg
  }
  

}

# query{
#   MG_getFirst{
#    	__typename
  	
# 	}
# }

# query{
#   MG_getGoalsByOwner(ownerId: "091823812-1298312" ){
#     name,
#     goalMsg,
#     aquiredAmount
#   }
# }

# query{
#   # MG_createAccount(userInfo: {id:"user-1", email: "test2@gmail.com", password:"test123", accBalance:4000000 }),
#   MG_loginUser(userInfo: {id:"user-1", email: "test2@gmail.com", password:"test123"}){
#    id
#    accBalance
#  }
# }



