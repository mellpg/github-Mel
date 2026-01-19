import sys
import os

# Cria o caminho do arquivo na mesma pasta do script
caminho = os.path.join(os.path.dirname(__file__), "alunos.txt")

# Função de validação de data
# Retornando false se não válido e true se válido
def validate_date(dia, mes, ano):
    # Validação de ano
    if ano > 2025 or ano < 1900:
        return False
    # Validação de mês
    if mes < 1 or mes > 12:
        return False
    # Validação de dia
    if dia < 1:
        return False
    # Validação dos dias de cada mês específico
    # verificando se o ano é bissexto:
    leap_year = (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0)
    # fevereiro
    if mes == 2:
        if leap_year and dia > 29:
            return False
        if not leap_year and dia > 28:
            return False
    # Dias 30 e 31
    if mes in [4, 6, 9, 11]:
        if dia > 30:
            return False
    else:
        if dia > 31:
            return False
    # Tudo acima OK retorna True
    return True


# Função que coleta os dados via input e grava no arquivo alunos.txt
def insert_student():
    # Inputs: recebem dados digitados pelo usuário
    nome = input("Nome: ")
    data = input("Data de nascimento (dd/mm/aaaa): ")
    matricula = input("Matrícula: ")
    curso = input("Curso: ")

    try:
        dia, mes, ano = map(int, data.split("/"))
    except BaseException:
        # Informar erro ao usuário
        print("Data inválida! Use o formato dd/mm/aaaa")
        return  # Interrompe a função

    # Chamando a função de validação de data
    if not validate_date(dia, mes, ano):
        print("Data de nascimento inválida!")
        return  # não vai salvar se estiver errado

    # Manipulação do arquivo
    # "a" significa append → acrescenta no fim do arquivo sem apagar
    with open(caminho, "a") as f:
        # Gravando aluno no formato pedido
        # nome;data;matricula;curso
        # O "\n" faz pular uma linha para o próximo registro
        f.write(f"{nome};{data};{matricula};{curso}\n")
        print("Aluno registrado:")


# Função que lê o arquivo e guarda na lista
def transfer_list():
    lista = []  # Armazenamento dos dados

    try:
        # abrindo arquivo em modo leitura
        with open(caminho, "r") as f:
            for linha in f:
                # strip() remove \n (quebra de linha)
                # split(";") separa os dados
                nome, data, matricula, curso = linha.strip().split(";")
                # Monta uma sublista com os dados do aluno
                lista.append([nome, data, matricula, curso])
    except FileNotFoundError:
        # Caso arquivo não encontrado (primeira execução)
        print("Arquivo não encontrado. Nenhum aluno foi cadastrado ainda.")

    # Retorna lista
    return lista


# Main
while True:
    insert_student()  # cadastra um aluno

    resp = input("Deseja cadastrar outro aluno? (s/n): ").lower()
    if resp != "s":
        break

# Carregando todos os alunos do arquivo
lista = transfer_list()

# Exibindo lista no terminal
print("Lista atual de alunos:")
print(lista)
