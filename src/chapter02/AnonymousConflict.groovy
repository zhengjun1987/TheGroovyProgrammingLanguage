class Calibrator {
    Calibrator(calculationBlock) {
        print('Using... ')
        calculationBlock()
    }
}

def calibrator = new Calibrator({
    println 'The calculation provided'
})
//        Using... The calculation provided