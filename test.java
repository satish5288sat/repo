
#!grrovy
def=fail
def=sucess
def=error

>>>>>>> 3feb423a5bf6ba7aabfce1740b59510b092adf54
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
