mavenJob('DNF-API') { // Name of the Jenkins job
    jdk('1.8')
    scm {
        github('git://github.com/VargasRaymondJ/DNF2018-API')
    }
    triggers {
        githubPush()
    }
    goals('clean')
    goals('install')
}

// mavenJob('example') {
//     logRotator(-1, 10)
//     jdk('Java 8')
//     scm {
//         github('jenkinsci/jenkins', 'master')
//     }
//     triggers {
//         githubPush()
//     }
//     goals('clean verify')
// }
