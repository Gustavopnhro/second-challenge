
``` mermaid
graph TD
  A[{"task": {
      "id_task": 1,
      "name": "Lavar Roupa",
      "priority": "3",
      "initial_date": "10/10/2023",
      "final_date": "22/10/2023",
      "description": "Separar as roupas amarelas das brancas"
  }}]-->|id_task: 1|B((Lavar Roupa))
  B-->|priority: 3|C((Prioridade: 3))
  B-->|initial_date: 10/10/2023|D((Data Inicial: 10/10/2023))
  B-->|final_date: 22/10/2023|E((Data Final: 22/10/2023))
  B-->|description: Separar as roupas amarelas das brancas|F((Descrição: Separar as roupas amarelas das brancas))
  
  ```