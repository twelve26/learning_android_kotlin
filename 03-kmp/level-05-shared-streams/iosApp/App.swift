import SwiftUI
import Shared

@main struct LearningApp: App {
    var body: some Scene { WindowGroup { WorkshopView() } }
}

struct WorkshopView: View {
    @State private var counter = Counter()
    @State private var subscription: Subscription?
    @State private var value: Int32 = 0

    var body: some View {
        VStack(spacing: 20) {
            Text("Shared streams and lifecycle").font(.title)
            Text("Shared state: \(value)")
            Button("Increment") { counter.increment() }
            Text("Observation begins on appearance and is cancelled on disappearance.")
        }
        .padding()
        .onAppear {
            subscription?.cancel()
            subscription = counter.observe { next in
                value = next.int32Value
            }
        }
        .onDisappear {
            subscription?.cancel()
            subscription = nil
        }
    }
}
