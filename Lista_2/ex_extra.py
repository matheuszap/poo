
class Jogo:
    def __init__(self, nome, tipo, console):
        self.nome = nome
        self.tipo = tipo
        self.console = console

    def __str__(self):
        print(f"Nome: {self.nome}\n"
              F"Tipo: {self.tipo}\n"
              F"Console: {self.console}\n")


j1 = Jogo("lol","moba","pc")
j2 = Jogo("cs","fps","xbox")

j1.__str__()
j2.__str__()