import json

#f'Nome: {self.nome} \nIdade: {self.idade}\nCPF: {self.cpf}\nNotas: {self.notas}\n'

class Aluno:
    def __init__(self, nome, idade, cpf, notas):
        self.nome = nome
        self.idade = idade
        self.cpf = cpf
        self.notas = notas
    
    def get_notas(self):
        return self.notas

    @classmethod
    def from_json(cls, json_string):
        json_dict = json.loads(json_string)
        return cls(**json_dict)
    
    def __repr__(self):
        return f'Nome: {self.nome} \nIdade: {self.idade}\nCPF: {self.cpf}\nNotas: {self.notas}\n'


users_list = []
with open('data.json','r') as json_file:
    user_data = json.loads(json_file.read())
    for u in user_data:
        users_list.append(Aluno(**u))
    
print(users_list)