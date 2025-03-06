#!/bin/bash

FILE="main.kt"
OUTPUT="main.jar"

# Compilar o código Kotlin e gerar o arquivo JAR
kotlinc $FILE -include-runtime -d $OUTPUT

# Verificar se o arquivo JAR foi gerado com sucesso
if [ $? -eq 0 ]; then
    echo "Compilação bem-sucedida! Arquivo main.jar gerado."
    java -jar $OUTPUT
else
    echo "Erro na compilação."
fi

