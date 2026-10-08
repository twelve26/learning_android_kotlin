import SwiftUI
import Shared
@main struct LearningApp: App { var body: some Scene { WindowGroup { SharedView().ignoresSafeArea(edges: .bottom) } } }
struct SharedView: UIViewControllerRepresentable {
 func makeUIViewController(context: Context) -> UIViewController { MainViewControllerKt.MainViewController() }
 func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}
