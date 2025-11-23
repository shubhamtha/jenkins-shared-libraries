def call() {
    dependencyCheck additionalArguments: '--scan ./ --out ./dependency-check-report --data ./dependency-check-data'
    dependencyCheckPublisher pattern: '**/dependency-check-report/*.xml'
}
