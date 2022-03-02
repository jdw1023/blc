import glob
import os

OPTIONS = ''
for filename in glob.iglob('test/**/*.bl', recursive=True):
     print(f'./build/install/blc/bin/blc {OPTIONS} {filename}')
     print(os.popen(f'./build/install/blc/bin/blc {OPTIONS} {filename}').read())
