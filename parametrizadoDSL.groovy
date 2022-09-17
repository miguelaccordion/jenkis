job('ejemplo2-job-DSL'){
  	description('Job DSL de ejemplo para el curso de Jenkins')
  scm {
    git('https://github.com/miguelaccordion/jenkis.git', 'master') {node ->
      node / gitConfigName('Miguel')
      node / gitConfigEmail('mbarbosa@promad.com.mx')
    }
  }
  parameters {
    stringParam('nombre', defaultValue = 'Julian',description = 'Parametro de cadena para Job')
    choiceParam('planeta', ['Mercurio', 'Tierra', 'Marte', 'Saturno'])
    booleanParam('agente', false)
  }
  triggers {
    cron( 'H/7 * * * *')
  }
  steps {
    shell("bash jobscript.sh")
  }
  publishers {
    mailer('miguel_heavy@hotmail.com', true, true)
  }
}
