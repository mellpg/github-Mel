# Sistema simples de cadastro e consulta de alunos

def cadastrar_aluno():
    """
    Cadastra um aluno com nome, idade e curso
    e grava no arquivo alunos.txt
    """
    nome = input("Nome do aluno: ")
    idade = input("Idade do aluno: ")
    curso = input("Curso: ")

    with open("alunos.txt", "a") as f:
        f.write(f"{nome};{idade};{curso}\n")

    print(f"Aluno {nome} cadastrado com sucesso!\n")


def listar_alunos():
    """
    Lê o arquivo alunos.txt e exibe a lista de alunos
    """
    try:
        with open("alunos.txt", "r") as f:
            alunos = f.readlines()
        if not alunos:
            print("Nenhum aluno cadastrado.\n")
            return
        print("Lista de alunos cadastrados:")
        for linha in alunos:
            nome, idade, curso = linha.strip().split(";")
            print(f"Nome: {nome}, Idade: {idade}, Curso: {curso}")
        print()
    except FileNotFoundError:
        print("Arquivo não encontrado. Nenhum aluno cadastrado ainda.\n")


def buscar_aluno():
    """
    Busca um aluno pelo nome
    """
    nome_busca = input("Digite o nome do aluno que deseja buscar: ")
    encontrado = False
    try:
        with open("alunos.txt", "r") as f:
            for linha in f:
                nome, idade, curso = linha.strip().split(";")
                if nome.lower() == nome_busca.lower():
                    print(
                        f"Aluno encontrado: Nome: {nome}, Idade: {idade}, Curso: {curso}\n")
                    encontrado = True
                    break
        if not encontrado:
            print(f"Aluno {nome_busca} não encontrado.\n")
    except FileNotFoundError:
        print("Arquivo não encontrado. Nenhum aluno cadastrado ainda.\n")


def main():
    while True:
        print("Sistema de Cadastro de Alunos")
        print("1 - Cadastrar aluno")
        print("2 - Listar alunos")
        print("3 - Buscar aluno")
        print("4 - Sair")
        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            cadastrar_aluno()
        elif opcao == "2":
            listar_alunos()
        elif opcao == "3":
            buscar_aluno()
        elif opcao == "4":
            print("Saindo...")
            break
        else:
            print("Opção inválida!\n")


if __name__ == "__main__":
    main()
